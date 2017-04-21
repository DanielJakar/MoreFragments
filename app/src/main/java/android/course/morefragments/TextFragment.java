package android.course.morefragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class TextFragment extends Fragment {


    public static final String ARG_TEXT = "TheText";

    //    public static TextFragment getInstance (String text){
//
//    }
    //Factory method:
    public static TextFragment newInstance(String text) {
        TextFragment fragment = new TextFragment();

        Bundle args = new Bundle();
        args.putString(ARG_TEXT, text);

        fragment.setArguments(args);


        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_text, container, false);

        Bundle args = getArguments();
        String text = args.getString(ARG_TEXT);

        TextView tvText = (TextView) v.findViewById(R.id.tvText);

        tvText.setText(text);

        return v;
    }

}
