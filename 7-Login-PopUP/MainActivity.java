
    AlertDialog myDialog;
    EditText nam, pass;
    Button Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nam = (EditText)findViewById(R.id.nam);
        pass = (EditText)findViewById(R.id.pass);
        Login = (Button)findViewById(R.id.loginn);


        myDialog = new AlertDialog.Builder(this).create();
        myDialog.setTitle("LOGIN");

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myName = nam.getText().toString();
                String myPass = pass.getText().toString();
                if(myName.equals("Faisal") || myName.equals("root"))
                {
                    if(myPass.equals("pass123"))
                    {
                        myDialog.setMessage("Welcome "+myName);
                        myDialog.show();
                    }
                    else
                    {
                        myDialog.setMessage("Incorrect password!");
                        myDialog.show();
                    }
                }
                else
                {
                    myDialog.setMessage("Incorrect username");
                    myDialog.show();
                }

            }
        });
    }
