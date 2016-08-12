package com.example.timothy.tryfragmentbasic;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link UpperFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 */
public class UpperFragment extends Fragment implements View.OnClickListener {

    private OnFragmentInteractionListener mListener;

    Button btnPotato, btnTomato;

    // Required empty public constructor
    public UpperFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_upper, container, false);
        btnPotato = (Button) rootView.findViewById(R.id.buttonPotato);
        btnPotato.setOnClickListener(this);
        btnTomato = (Button) rootView.findViewById(R.id.buttonTomato);
        btnTomato.setOnClickListener(this);
        return rootView;
    }

    public void onPotato() {
        if (mListener != null) {
            mListener.onFragmentInteraction("This is potato");
        }
    }

    public void onTomato() {
        if (mListener != null) {
            mListener.onFragmentInteraction("This is tomato");
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonPotato:
                onPotato();
                break;
            case R.id.buttonTomato:
                onTomato();
                break;
            default:break;
        }
    }

    /**This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.*/
    public interface OnFragmentInteractionListener {
        void onFragmentInteraction(String sentence);
    }
}
