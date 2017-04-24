package android.course.morefragments;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import java.util.Random;


/**
 * A simple {@link Fragment} subclass.
 */
public class ColorFragment extends Fragment {


    public ColorFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_color, container, false);

        View colorFrame = (LinearLayout) v.findViewById(R.id.colorFrame);

        Random r = new Random();

        int rgb = Color.rgb(r.nextInt(256), r.nextInt(256), r.nextInt(256));

        colorFrame.setBackgroundColor(rgb);

        return v;
    }

}
