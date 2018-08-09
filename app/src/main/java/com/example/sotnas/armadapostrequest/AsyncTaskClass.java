package com.example.sotnas.armadapostrequest;

import android.os.AsyncTask;

import java.net.MalformedURLException;
import java.net.URL;

public class AsyncTaskClass extends AsyncTask <String, String, String>{


    public AsyncTaskClass() {

    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected String doInBackground(String... strings) {

        String x = "http://localhost/armada-api/public/api/locations";

        ConnecttoURL connecttoURL = new ConnecttoURL();
        connecttoURL.performPostCall(x, );

        return null;
    }



    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
    }
}
