package yobra.msupa.brianyobra.fragments;

/**
 * Created by brianyobra on 8/27/18.
 */
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
public class PM_Fragment extends Fragment{
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
/**
 * Inflate the layout for this fragment
 */
        return inflater.inflate(
                R.layout.pm_fragment, container, false);
    }
}