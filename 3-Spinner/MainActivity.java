
    private String[] listOfObjects;

    private TypedArray images;

    private ImageView itemImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listOfObjects = getResources().getStringArray(R.array.object_array);

        images = getResources().obtainTypedArray(R.array.object_image);

        itemImage = (ImageView)findViewById(R.id.myImage);

        final Spinner mySpinner = (Spinner)findViewById(R.id.mySpinner);

        ArrayAdapter<String> mySpinnerAdapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_item, listOfObjects);
        mySpinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_item);

        mySpinner.setAdapter(mySpinnerAdapter);

        mySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                itemImage.setImageResource(images.getResourceId(mySpinner.getSelectedItemPosition(), -1));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {  }
        });
    }
