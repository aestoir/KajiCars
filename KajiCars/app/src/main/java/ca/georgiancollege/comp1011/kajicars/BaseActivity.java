package ca.georgiancollege.comp1011.kajicars;

import android.content.Intent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;

public abstract class BaseActivity extends AppCompatActivity {
    @Override
    public boolean onCreateOptionsMenu(Menu menu){

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);

        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){

        Intent intent;

        switch (item.getItemId()){
            case R.id.homePage:
                // act if the current activity is not the main activity
                if (!this.getClass().getSimpleName().equals("MainActivity")) {
                    intent = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(intent);
                }
                break;
            case R.id.viewAllVehicles:
                intent = new Intent(getApplicationContext(), ListActivity.class);
                startActivity(intent);
                break;
            case R.id.viewAvailableVehicles:
                intent = new Intent(getApplicationContext(), ListActivity.class);
                intent.putExtra("fun", "Georgian College");
                startActivity(intent);
                break;
            case R.id.viewSoldVehicles:
                intent = new Intent(getApplicationContext(), VehicleActivity.class);
                startActivity(intent);
                break;
            case R.id.viewCompanyDetails:
                intent = new Intent(getApplicationContext(), CompanyActivity.class);
                startActivity(intent);
                break;
            default:
                intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
        }
        return true;
    }

}
