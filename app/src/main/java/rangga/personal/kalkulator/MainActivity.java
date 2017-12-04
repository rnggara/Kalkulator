package rangga.personal.kalkulator;

import android.renderscript.Double2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private String bil = "", operator;
    private double a, b, c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.satu).setOnClickListener(this);
        findViewById(R.id.dua).setOnClickListener(this);
        findViewById(R.id.tiga).setOnClickListener(this);
        findViewById(R.id.empat).setOnClickListener(this);
        findViewById(R.id.lima).setOnClickListener(this);
        findViewById(R.id.enam).setOnClickListener(this);
        findViewById(R.id.tujuh).setOnClickListener(this);
        findViewById(R.id.delapan).setOnClickListener(this);
        findViewById(R.id.sembilan).setOnClickListener(this);
        findViewById(R.id.nol).setOnClickListener(this);
        findViewById(R.id.koma).setOnClickListener(this);
        findViewById(R.id.tambah).setOnClickListener(this);
        findViewById(R.id.kurang).setOnClickListener(this);
        findViewById(R.id.bagi).setOnClickListener(this);
        findViewById(R.id.kali).setOnClickListener(this);
        findViewById(R.id.samadengan).setOnClickListener(this);
        findViewById(R.id.clear).setOnClickListener(this);
    }

    public void hasil(){
        b = Double.parseDouble(bil);
        bil="";
        switch (operator){
            case "+" :
                c = a + b;
                break;
            case "-" :
                c = a - b;
                break;
            case "/" :
                c = a / b;
                break;
            case "x" :
                c = a * b;
                break;
        }
        EditText editText = (EditText) findViewById(R.id.editText);
        editText.setText(a + " " + operator + " " + b + " = " + c);
        editText.setSelection(editText.getText().length());
    }

    public void operasi(String i){
        a = Double.parseDouble(bil);
        bil = "";
        operator = i;
        EditText editText = (EditText) findViewById(R.id.editText);
        editText.setText(i);
        editText.setSelection(editText.getText().length());
    }

    public void display(String i){
        EditText editText = (EditText) findViewById(R.id.editText);
        bil = bil + i;
        editText.setText(bil);
        editText.setSelection(editText.getText().length());
    }

    public void clear(){
        EditText editText = (EditText) findViewById(R.id.editText);
        bil="";
        editText.setText("");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.satu :
                display("1");
                break;
            case R.id.dua :
                display("2");
                break;
            case R.id.tiga :
                display("3");
                break;
            case R.id.empat :
                display("4");
                break;
            case R.id.lima :
                display("5");
                break;
            case R.id.enam :
                display("6");
                break;
            case R.id.tujuh :
                display("7");
                break;
            case R.id.delapan :
                display("8");
                break;
            case R.id.sembilan :
                display("9");
                break;
            case R.id.nol :
                display("0");
                break;
            case R.id.koma :
                display(".");
                break;
            case R.id.tambah :
                operasi("+");
                break;
            case R.id.kurang :
                operasi("-");
                break;
            case R.id.bagi :
                operasi("/");
                break;
            case R.id.kali :
                operasi("x");
                break;
            case R.id.samadengan :
                hasil();
                break;
            case R.id.clear :
                clear();
                break;
        }
    }
}
