package com.abc.apptracnghiem.Fragment;import android.content.Intent;import android.os.Bundle;import android.support.annotation.Nullable;import android.support.v4.app.Fragment;import android.view.LayoutInflater;import android.view.View;import android.view.ViewGroup;import android.widget.AdapterView;import android.widget.GridView;import com.abc.apptracnghiem.MainActivity;import com.abc.apptracnghiem.Question.TypeQuestion;import com.abc.apptracnghiem.Question.TypeQuestionController;import com.abc.apptracnghiem.R;import com.abc.apptracnghiem.Topic.Exam;import com.abc.apptracnghiem.Topic.ExamAdapter;import com.abc.apptracnghiem.slides.ScreenSlideActivity;import java.util.ArrayList;/** * A simple {@link Fragment} subclass. */public class InbuiltClassesFragment extends Fragment {    private final String TOPIC = "Inbuilt Classes";    ExamAdapter examAdapter;    GridView gvExam;    ArrayList<Exam> arrExam = new ArrayList<>();    ArrayList<TypeQuestion> typeQuestions;    TypeQuestionController typeQuestionController;    public InbuiltClassesFragment() {        // Required empty public constructor    }    @Override    public View onCreateView(LayoutInflater inflater, ViewGroup container,                             Bundle savedInstanceState) {        // Inflate the layout for this fragment        typeQuestionController = new TypeQuestionController(getActivity());        typeQuestions = typeQuestionController.getTypeQuestions(TOPIC);        ((MainActivity) getActivity()).getSupportActionBar().setTitle(TOPIC);        return inflater.inflate(R.layout.fragment_oops_concept_features, container, false);    }    @Override    public void onActivityCreated(@Nullable Bundle savedInstanceState) {        super.onActivityCreated(savedInstanceState);        gvExam = getActivity().findViewById(R.id.gv_opp_con_fea);        for (int i = 0; i < typeQuestions.size(); i++) {            arrExam.add(new Exam(typeQuestions.get(i).getName()));        }        examAdapter = new ExamAdapter(getActivity(), arrExam);        gvExam.setAdapter(examAdapter);        gvExam.setOnItemClickListener(new AdapterView.OnItemClickListener() {            @Override            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {                Intent intent = new Intent(getActivity(), ScreenSlideActivity.class);                intent.putExtra("type_question", typeQuestions.get(position).getId());                intent.putExtra("topic", TOPIC);                startActivity(intent);            }        });    }}