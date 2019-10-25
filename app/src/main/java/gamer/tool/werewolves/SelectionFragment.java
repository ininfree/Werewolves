package gamer.tool.werewolves;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * 在此写用途
 *
 * @FileName: gamer.tool.werewolves.SelectionFragment.java
 * @author: TimYeh
 * @date: 2019-10-25 18:28
 */
public class SelectionFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    // TODO: Rename and change types of parameters
    private static final String TAG = "SelectionFragment";

    Button button;

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MoneySubFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static SelectionFragment newInstance(String param1, String param2) {
        SelectionFragment fragment = new SelectionFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        
        return fragment;
    }

    public SelectionFragment() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_selection, container, false);
        initView(root);
        return root;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    private void initView(View view) {
        button = view.findViewById(R.id.btn);
    }

    private void setListener() {
        //button.setOnClickListener(v -> changeFragment());
    }

    private void changeFragment() {
        ((MainActivity) getActivity()).showFragment(RandomRoleFragment.newInstance("", ""));
    }
}
