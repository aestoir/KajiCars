package ca.georgiancollege.comp1011.kajicars;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class VehicleActivity extends BaseActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_vehicle);
    }

    // get values from form
    public List<TextView> getFields() {
        TextView make = findViewById(R.id.addMake);
        TextView model = findViewById(R.id.addModel);
        TextView condition = findViewById(R.id.addCondition);
        TextView engineCylinder = findViewById(R.id.addEngineCylinders);
        TextView year = findViewById(R.id.addYear);
        TextView numOfDoors = findViewById(R.id.addNumOfDoors);
        TextView price = findViewById(R.id.addPrice);
        TextView color = findViewById(R.id.addColor);
        TextView thumbnail = findViewById(R.id.addThumbnailImage);
        TextView image = findViewById(R.id.addImage);

        return List.of(make, model, condition, engineCylinder, year,  numOfDoors, price, color, thumbnail, image);
    }

    // create a list for all fields
    public List<String> getVehicleValues(List<TextView> fields) {
        List<String> values = new ArrayList<>();
        for (TextView field : fields) {
            values.add(field.getText().toString());
        }

        return values;
    }

    // validate form when submit button is clicked
    public boolean onSubmitClick() {
        // get values from form
        List<String> values = getVehicleValues(getFields());

        TextView error = findViewById(R.id.error);

        // check if any fields are empty
        for (String value : values) {
            if (value.isEmpty()) {
                // show error
                error.setText("Please fill out all fields");
                return false;
            }
        }

        // check if year is a number
        try {
            Integer.parseInt(values.get(4));
        } catch (NumberFormatException e) {
            error.setText("Year must be a number");
            return false;
        }

        // check if doors is a number
        try {
            Integer.parseInt(values.get(5));
        } catch (NumberFormatException e) {
            error.setText("Number of doors must be a number");
            return false;
        }
        return true;
    }

    // save vehicle
    public void saveVehicle() {
        // get values from form
        List<String> fields = getVehicleValues(getFields());

        // create new vehicle
        Vehicle vehicle = new Vehicle(fields.get(0), fields.get(1), fields.get(2), fields.get(3), Integer.parseInt(fields.get(4)), Integer.parseInt(fields.get(5)), Double.parseDouble(fields.get(6)), fields.get(7), fields.get(8), fields.get(9));

        // write vehicle to file


    }

    // clear form when clear button is clicked
    public void clearForm() {
        // get values from form
        List<TextView> fields = getFields();

        // clear all fields
        for (TextView field : fields) {
            field.setText("");
        }
    }
}
