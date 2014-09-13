package in.jamesjlee.mtglifecounter_d20;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by crisp on 9/12/14.
 */
public class frag1 extends Fragment {
    public TextView  lifeCountP1;
    public TextView lifeCountP2;
    public Button gainP1;
    public Button loseP1;
    public Button gainP2;
    public Button loseP2;
    public Button reset;
    int p1Life = 20;
    int p2Life = 20;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.life_counter, container, false);

        lifeCountP1 = (TextView) rootView.findViewById(R.id.lifeCountP1);
        lifeCountP2 = (TextView) rootView.findViewById(R.id.lifeCountP2);
        gainP1 = (Button) rootView.findViewById(R.id.gainP1);
        gainP2 = (Button) rootView.findViewById(R.id.gainP2);
        loseP1 = (Button) rootView.findViewById(R.id.loseP1);
        loseP2 = (Button) rootView.findViewById(R.id.loseP2);
        reset = (Button) rootView.findViewById(R.id.reset);

        gainP1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p1Life += 1;
                lifeCountP1.setText(Integer.toString(p1Life));
            }
        });

        loseP1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p1Life -= 1;
                lifeCountP1.setText(Integer.toString(p1Life));
            }
        });

        gainP2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p2Life += 1;
                lifeCountP2.setText(Integer.toString(p2Life));
            }
        });

        loseP2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p2Life -= 1;
                lifeCountP2.setText(Integer.toString(p2Life));
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p1Life = 20;
                lifeCountP1.setText(Integer.toString(p1Life));
                p2Life = 20;
                lifeCountP2.setText(Integer.toString(p2Life));
            }
        });
        return rootView;
    }
}
