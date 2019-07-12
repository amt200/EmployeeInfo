package sg.edu.rp.c346.employeeinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ListView lvEmpInfo;
ArrayList<Employee> empAL;
CustomAdapter caEmp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvEmpInfo = findViewById(R.id.listViewEmp);
        empAL = new ArrayList<Employee>();
        caEmp = new CustomAdapter(MainActivity.this, R.layout.row, empAL);
        empAL.add(new Employee("Software Technical Leader","John",3400.0));
        empAL.add(new Employee("Programmer","May",2200.0));
        lvEmpInfo.setAdapter(caEmp);
        caEmp.notifyDataSetChanged();
    }
}
