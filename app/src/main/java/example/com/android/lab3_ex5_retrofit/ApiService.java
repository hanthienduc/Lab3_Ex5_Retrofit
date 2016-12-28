package example.com.android.lab3_ex5_retrofit;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Han on 27/12/2016.
 */

public interface ApiService {
    /*
    Retrofit get annotation with our URL
    And our method that will return us the List of ContactList
    */
    @GET("/json_data.json")
    Call<ContactList> getMyJSON();
}
