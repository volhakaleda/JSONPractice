package nyc.c4q.jsoninclassjose;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<String> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        String jsonString = "{\"status\":\"success\",\"message\":[\"affenpinscher\",\"african\",\"airedale\",\"akita\",\"appenzeller\",\"basenji\",\"beagle\",\"bluetick\",\"borzoi\",\"bouvier\",\"boxer\",\"brabancon\",\"briard\",\"bulldog\",\"bullterrier\",\"cairn\",\"chihuahua\",\"chow\",\"clumber\",\"collie\",\"coonhound\",\"corgi\",\"dachshund\",\"dane\",\"deerhound\",\"dhole\",\"dingo\",\"doberman\",\"elkhound\",\"entlebucher\",\"eskimo\",\"germanshepherd\",\"greyhound\",\"groenendael\",\"hound\",\"husky\",\"keeshond\",\"kelpie\",\"komondor\",\"kuvasz\",\"labrador\",\"leonberg\",\"lhasa\",\"malamute\",\"malinois\",\"maltese\",\"mastiff\",\"mexicanhairless\",\"mountain\",\"newfoundland\",\"otterhound\",\"papillon\",\"pekinese\",\"pembroke\",\"pinscher\",\"pointer\",\"pomeranian\",\"poodle\",\"pug\",\"pyrenees\",\"redbone\",\"retriever\",\"ridgeback\",\"rottweiler\",\"saluki\",\"samoyed\",\"schipperke\",\"schnauzer\",\"setter\",\"sheepdog\",\"shiba\",\"shihtzu\",\"spaniel\",\"springer\",\"stbernard\",\"terrier\",\"vizsla\",\"weimaraner\",\"whippet\",\"wolfhound\"]}";

        try{

            JSONObject jsonObject = new JSONObject(jsonString);

            JSONArray message = jsonObject.getJSONArray("message");

            arrayList = new ArrayList<>();

            for(int i = 0; i < message.length(); i++) {

                String s = (String)message.get(i);
                arrayList.add(s);
            }
        }

        catch(JSONException e) {
            e.printStackTrace();
        }

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        int numberOfColumns = 3;

        MessageAdapter messageAdapter = new MessageAdapter(arrayList);
        recyclerView.setAdapter(messageAdapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this, numberOfColumns));
    }
}
