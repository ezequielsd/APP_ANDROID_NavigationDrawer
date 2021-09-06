package com.ezequieldaniel.navigationdrawer.ui.sobre;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ezequieldaniel.navigationdrawer.R;

import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;


public class SobreFragment extends Fragment {

    public SobreFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        String descricao = "Sou Arquiteto de Software e tenho como missão apoiar organizações que desejam " +
                "alcançar o secesso atráves da excelência " +
                "em produtos de software.";

        Element versao = new Element();
        versao.setTitle("Versão 1.0");

        View aboutPage = new AboutPage(getActivity())
                .isRTL(false)
                .setImage(R.drawable.avatar)
                .setDescription(descricao)
                .addItem(versao)
                .addGroup("Entre em contato")
                .addEmail("ezequielsd@gmail.com", "Entre em contato")
                .addWebsite("https://ezequieldaniel.wordpress.com/")
                .addTwitter("ezequielsd", "Twitter")
                .addGitHub("ezequielsd", "GitHub")
                .addInstagram("ezequieldasilvadaniel", "Instagram")
                .create();

        return aboutPage;
    }
}