package com.example.kannadalanguage;

public class Word {
    private int mImageResourceId=-1;
    private String mDefaultTranslation;
    private String mKannadaTranslation;
    private int mAudioResourceId;
    public Word(String defaultTranslation,String kannadaTranslation,int audioResourceId){
        mDefaultTranslation=defaultTranslation;
        mKannadaTranslation=kannadaTranslation;
        mAudioResourceId=audioResourceId;

    }
    public Word(String defaultTranslation,String kannadaTranslation,int imageResourceId,int audioResourceId){
        mImageResourceId=imageResourceId;
        mDefaultTranslation=defaultTranslation;
        mKannadaTranslation=kannadaTranslation;
        mAudioResourceId=audioResourceId;
    }
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }
    public String getKannadaTranslation(){
        return mKannadaTranslation;
    }
    public int getImageResourceId(){
        return mImageResourceId;
    }
    public  boolean hasImage(){
        return mImageResourceId!=-1;
    }
    public int getAudioResourceId(){return mAudioResourceId;}
}
