package com.abc.apptracnghiem.Question;import android.content.Context;import android.database.Cursor;import android.database.sqlite.SQLiteDatabase;import java.util.ArrayList;public class QuestionController {    private DBHelper dbHelper;    public QuestionController(Context context) {        dbHelper = new DBHelper(context);    }    public ArrayList<Question> getQuestion(String topic, int typeQuestion) {        ArrayList<Question> questions = new ArrayList<>();        SQLiteDatabase database = dbHelper.getReadableDatabase();        Cursor cursor = database.rawQuery("SELECT * FROM quizQuestions WHERE type_question=" + typeQuestion+"", null);        cursor.moveToFirst();        do {            Question item = new Question(cursor.getInt(0), cursor.getString(1), cursor.getString(2)                    , cursor.getString(3), cursor.getString(4), cursor.getString(5), cursor.getString(6)                    , cursor.getString(7), cursor.getInt(8), cursor.getString(9),"");            questions.add(item);        } while (cursor.moveToNext());        return questions;    }}