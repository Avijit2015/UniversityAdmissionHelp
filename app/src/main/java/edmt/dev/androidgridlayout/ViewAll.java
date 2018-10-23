package edmt.dev.androidgridlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class ViewAll extends AppCompatActivity {

    ListView list;

    ArrayList<StudentInfo> stdntlst;

    DatabaseReference dr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_all);

        list = findViewById(R.id.list);
        stdntlst=new ArrayList<StudentInfo>();
        dr= FirebaseDatabase.getInstance().getReference("Student Info");


        dr.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for (DataSnapshot ds:dataSnapshot.getChildren())
                {
                    StudentInfo user=ds.getValue(StudentInfo.class);
                    stdntlst.add(user);

                }

                StudentAdapter adapter=new StudentAdapter(ViewAll.this,stdntlst);
                list.setAdapter(adapter);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }
}
