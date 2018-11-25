
    RadioGroup rg;
    RadioButton DS, AP, OS, N, M;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rg = (RadioGroup)findViewById(R.id.rg);

        DS = (RadioButton)findViewById(R.id.DS);
        AP = (RadioButton)findViewById(R.id.AP);
        OS = (RadioButton)findViewById(R.id.OS);
        N = (RadioButton)findViewById(R.id.N);
        M = (RadioButton)findViewById(R.id.M);

        btn = (Button)findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(DS.isChecked())  {
                    Toast.makeText(getApplicationContext(), "Vipin Sir", Toast.LENGTH_SHORT).show();
                }

                if(AP.isChecked())  {
                    Toast.makeText(getApplicationContext(), "Arun Sir", Toast.LENGTH_SHORT).show();
                }

                if(OS.isChecked())  {
                    Toast.makeText(getApplicationContext(), "Sheetal Ma'am", Toast.LENGTH_SHORT).show();
                }

                if(N.isChecked())   {
                    Toast.makeText(getApplicationContext(), "Nikhil Sir", Toast.LENGTH_SHORT).show();
                }

                if(M.isChecked())   {
                    Toast.makeText(getApplicationContext(), "Sir", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
