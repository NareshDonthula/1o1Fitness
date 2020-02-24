package com.fitness.FitnessApp.repo;

import java.util.List;


import com.fitness.FitnessApp.modal.MyProgramModal;

public interface MyProgram {
	
    List<MyProgramModal> getAllProgramsById(String userId);
    MyProgramModal addNewProgram(MyProgramModal program);
    MyProgramModal getProgramByProgramId(String programId);
    MyProgramModal UpdateMyprogram(String programId, MyProgramModal data);
}
