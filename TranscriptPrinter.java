package StudentDB;

import java.util.ArrayList;
import java.util.Iterator;

public class TranscriptPrinter extends StudentRecordManager{

    public void printTranscript(Iterator studentIterator, int ID) {
        while(studentIterator.hasNext()&& search(ID) != null){
            Student student = search(ID);
            if (student.getID() == ID) {
                System.out.println(student.getCourseIterator());
            }
           // System.out.println(studentIterator.);
        }
    }

    public void printTranscript(Iterator studentIterator, ArrayList<Integer> studentIDs) {
        for(Integer ids : studentIDs) {
           printTranscript(studentIterator,ids);
        }
    }
}
