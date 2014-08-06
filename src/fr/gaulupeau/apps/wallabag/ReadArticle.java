package fr.gaulupeau.apps.wallabag;

import static fr.gaulupeau.apps.wallabag.Helpers.getInputStreamFromUrl;

import org.json.JSONException;
import org.json.JSONObject;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;
import fr.gaulupeau.apps.Wallabag.R;

public class ReadArticle extends Activity {
	TextView txtTitre;
	TextView txtContent;

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.article);
		String ret = getInputStreamFromUrl("http://poche.gaulupeau.fr/toto.php");
		try {
			JSONObject rootobj = new JSONObject(ret);
			System.out.println(rootobj);
			txtTitre = (TextView) findViewById(R.id.txtTitre);
			txtContent = (TextView) findViewById(R.id.txtContent);
			txtTitre.setText(Html.fromHtml(rootobj.getString("titre")));
			txtContent.setText(Html.fromHtml(rootobj.getString("content")));
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
