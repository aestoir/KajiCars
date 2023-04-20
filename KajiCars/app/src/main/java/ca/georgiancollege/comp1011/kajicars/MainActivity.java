package ca.georgiancollege.comp1011.kajicars;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button createButton = findViewById(R.id.createButton);
        createButton.setOnClickListener(v -> {
            try {
                startActivity(new Intent(getApplicationContext(), VehicleActivity.class));
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        Button viewAllButton = findViewById(R.id.viewAllButton);
        viewAllButton.setOnClickListener(v -> {
            try {
                startActivity(new Intent(getApplicationContext(), ListActivity.class));
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        //create a list of vehicles
        List<Vehicle> vehicles = new ArrayList<>();

        //add vehicles to the list
        vehicles.add(new Vehicle("Toyota", "Corolla", "Used", "4", 2018, 4, 20000.00, "Red", "https://www.toyota.com/imgix/responsive/images/mlp/colorizer/2020/corolla/ce/2t1b1revxlc000001/2t1b1revxlc000001-exterior-01.jpg?auto=format%2Ccompress&fit=crop&h=300&w=300", "https://www.toyota.com/imgix/responsive/images/mlp/colorizer/2020/corolla/ce/2t1b1revxlc000001/2t1b1revxlc000001-exterior-01.jpg?auto=format%2Ccompress&fit=crop&h=300&w=300"));
        vehicles.add(new Vehicle("Toyota", "Corolla", "Used", "4", 2018, 4, 20000.00, "Red", "https://www.toyota.com/imgix/responsive/images/mlp/colorizer/2020/corolla/ce/2t1b1revxlc000001/2t1b1revxlc000001-exterior-01.jpg?auto=format%2Ccompress&fit=crop&h=300&w=300", "https://www.toyota.com/imgix/responsive/images/mlp/colorizer/2020/corolla/ce/2t1b1revxlc000001/2t1b1revxlc000001-exterior-01.jpg?auto=format%2Ccompress&fit=crop&h=300&w=300"));
        vehicles.add(new Vehicle("Toyota", "Corolla", "Used", "4", 2018, 4, 20000.00, "Red", "https://www.toyota.com/imgix/responsive/images/mlp/colorizer/2020/corolla/ce/2t1b1revxlc000001/2t1b1revxlc000001-exterior-01.jpg?auto=format%2Ccompress&fit=crop&h=300&w=300", "https://www.toyota.com/imgix/responsive/images/mlp/colorizer/2020/corolla/ce/2t1b1revxlc000001/2t1b1revxlc000001-exterior-01.jpg?auto=format%2Ccompress&fit=crop&h=300&w=300"));

        //create a vehicle adapter


    }


    public void onCreateClick(View view){
        startActivity(new Intent(getApplicationContext(), VehicleActivity.class));

    }

}
