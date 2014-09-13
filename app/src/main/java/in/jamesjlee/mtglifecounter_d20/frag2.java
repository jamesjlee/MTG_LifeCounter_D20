package in.jamesjlee.mtglifecounter_d20;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

/**
 * Created by crisp on 9/12/14.
 */
public class frag2 extends android.app.Fragment {
    public TextView result;
    public Button rollD20;
    public int max = 20;
    public int min = 1;
    public int range = max - min + 1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.d20, container, false);
        rollD20 = (Button) rootView.findViewById(R.id.roll);
        result = (TextView) rootView.findViewById(R.id.result);
        rollD20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomNum = new Random();
                int random = randomNum.nextInt(range) + min;
                result.setText(Integer.toString(random));
            }
        });
        return rootView;
    }
}
