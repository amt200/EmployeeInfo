package sg.edu.rp.c346.employeeinfo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<Employee> versionList;

    public CustomAdapter(Context context, int id, ArrayList<Employee> objects) {
        super(context, id, objects);
        parent_context = context;
        layout_id = id;
        versionList = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Obtain the LayoutInflater object
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // "Inflate" the View for each row
        View rowView = inflater.inflate(layout_id, parent, false);

        // Obtain the UI components and do the necessary binding
        TextView tvtitle = rowView.findViewById(R.id.textViewTitle);
        TextView tvName = rowView.findViewById(R.id.textViewName);
        TextView tvSalary = rowView.findViewById(R.id.textViewSalary);

        // Obtain the Android Version information based on the position
        Employee emp = versionList.get(position);

        // Set values to the TextView to display the corresponding information
        tvtitle.setText(emp.getTitle());
        tvName.setText(emp.getName());
        tvSalary.setText(emp.getSalary()+"");
        return rowView;
    }
}

