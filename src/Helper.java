import android.app.Activity;
import android.os.Bundle;

import com.google.android.glass.app.Card;


public class Helper extends Activity {
	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);

	        Card card = new Card(this);
	        card.setText("Hello world!");
	        card.setFootnote("Lecture Helper");

	        setContentView(card.getView());
	    }
}
