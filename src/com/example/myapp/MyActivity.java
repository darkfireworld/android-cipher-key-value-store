package com.example.myapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        KvStore kvStore = new KvStore(this, "KV_STORE", "darkgem");
        kvStore.put("AA", "CC");
        Toast.makeText(this, kvStore.get("AA"), Toast.LENGTH_SHORT).show();
        kvStore.remove("AA");
        Toast.makeText(this, kvStore.get("AA") == null ? "null" : "NOT NULL", Toast.LENGTH_SHORT).show();
    }
}
