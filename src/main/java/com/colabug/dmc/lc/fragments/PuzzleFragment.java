package com.colabug.dmc.lc.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.colabug.dmc.lc.R;

/**
 * @since 1.0
 */
public class PuzzleFragment extends Fragment
{
    @Override
    public View onCreateView (LayoutInflater inflater,
                              ViewGroup container,
                              Bundle savedInstanceState)
    {
        View layout = inflater.inflate( R.layout.fragment_puzzle, container, false );

        return layout;
    }

    public static PuzzleFragment newInstance()
    {
        return new PuzzleFragment();
    }
}
