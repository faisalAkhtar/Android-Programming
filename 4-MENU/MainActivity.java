
    ListView myList;
    TextView disp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        disp = (TextView)findViewById(R.id.tv2);
        myList = (ListView)findViewById(R.id.lv);

        final String[] students = new String[]    {
                "Faisal",
                "Shubhangi",
                "Aditya",
                "Ritick",
                "Namrata",
                "Pooja",
                "Gopal",
                "Akhilesh",
                "Adarsh"
        };

        List<String> students_list = new ArrayList<>(Arrays.asList(students));

        ArrayAdapter<String> myArrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, students_list);
        myList.setAdapter(myArrayAdapter);

        myList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selected = (String) parent.getItemAtPosition(position);
                disp.setText("You selected : "+selected);
            }
        });
    }
