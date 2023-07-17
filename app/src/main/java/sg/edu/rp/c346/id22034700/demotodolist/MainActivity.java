package sg.edu.rp.c346.id22034700.demotodolist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.CalendarContract;
import android.widget.ListView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    ListView lvToDo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvToDo = findViewById(R.id.lvToDo);
        ArrayList<ToDoItem> itemList = new ArrayList<>();

        Calendar calendar = Calendar.getInstance();

        ToDoItem item1 = new ToDoItem("Eat laptop", calendar);
        ToDoItem item2 = new ToDoItem("Eat chair", calendar);

        itemList.add(item1);
        itemList.add(item2);

        CustomAdapter adapter = new CustomAdapter(this, R.layout.row, itemList);
        lvToDo.setAdapter(adapter);
    }
}