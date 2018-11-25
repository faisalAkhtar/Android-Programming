public class MainActivity extends AppCompatActivity {

    EditText nam, pass;
    Button Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nam = (EditText)findViewById(R.id.nam);
        pass = (EditText)findViewById(R.id.pass);
        Login = (Button)findViewById(R.id.loginn);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myName = nam.getText().toString();
                String myPass = pass.getText().toString();
                if(myName.equals("Faisal") || myName.equals("root"))
                {
                    if(myPass.equals("pass123"))
                    {
                        Toast.makeText(MainActivity.this, "Welcome "+myName, Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this, "Incorrect password!", Toast.LENGTH_SHORT).show();
                    }
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Incorrect username", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}
