package huy.hdn.test230425;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        //Tao DB                                           <Ten>    <Quyen truy cap>
        SQLiteDatabase db = openOrCreateDatabase("books.db", MODE_PRIVATE, null);
        String sqltaobook = "CREATE TABLE BOOKS(BookID integer PRIMARY KEY, BookName text, Page integer, Price Float, Description text)";
        String sqlxoabook = "DROP TABLE IF EXISTS BOOKS";

        //Thuc thi lenh
        db.execSQL(sqlxoabook);
        db.execSQL(sqltaobook);

        //Doc Data
        String sqlselect = "SELECT * FROM books";

        //Thuc thi lenh, luu vao bien cursor
        Cursor cursor = db.rawQuery(sqlselect,null);
        //ArrayList<SACH> dsSach;
        //Cho handle cursor  di chuyen tung dong roi cho data vao dsSach
        ArrayList<Sach> dsSach = new ArrayList<Sach>();
        ArrayList<String> dsTenSach = new ArrayList<String>();
        while(true){
            if (cursor.moveToNext() == false)
                break;

            int mas = cursor.getInt(0); //Lay data cot 0 (ma sach)
            String tens = cursor.getString(1); //Lay data cot 1 (ten sach)
            int trangs = cursor.getInt(2);
            int gias = cursor.getInt(3);
            String motas = cursor.getString(4);
            Sach x= new Sach(mas, tens, trangs, gias,motas);
            // Thêm vào danh sách
            dsSach.add(x);
            dsTenSach.add(tens);



        }

    }
}