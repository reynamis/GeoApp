package com.jorgechuc.android.model;

/**
 * Created by rene on 17/05/2017.
 */

public class Pregunta {
int mIdResTexto;
    boolean mRespuestaVerdadera;

    public Pregunta() {

    }

    public Pregunta(int mIdResTexto, boolean mRespuestaVerdadera) {
        this.mIdResTexto = mIdResTexto;
        this.mRespuestaVerdadera = mRespuestaVerdadera;
    }

    public int getmIdResTexto() {
        return mIdResTexto;
    }

    public void setmIdResTexto(int mIdResTexto) {
        this.mIdResTexto = mIdResTexto;
    }

    public boolean ismRespuestaVerdadera() {
        return mRespuestaVerdadera;
    }

    public void setmRespuestaVerdadera(boolean mRespuestaVerdadera) {
        this.mRespuestaVerdadera = mRespuestaVerdadera;
    }
}
