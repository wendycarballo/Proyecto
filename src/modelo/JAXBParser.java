package modelo;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;

import java.io.File;
import java.io.FileOutputStream;

public class JAXBParser {
    public void marshall(Object o,String fileName){
        try {
            JAXBContext jContext = JAXBContext.newInstance(o.getClass());
            Marshaller marshallObj = jContext.createMarshaller();
            marshallObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
            marshallObj.marshal(o,new FileOutputStream(fileName));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Object unmarshall(Object ref, String fileName){
        Object o = null;
        try{
            File file = new File(fileName);
            JAXBContext jContext = JAXBContext.newInstance(ref.getClass());
            Unmarshaller unmarshallerObj = jContext.createUnmarshaller();
            o = unmarshallerObj.unmarshal(file);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return o;
    }

}
