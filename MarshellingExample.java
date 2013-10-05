package com.anuj.xml;

import com.anuj.entity.Customer;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

/**
 *
 * @author Anuj
 * www.goldenpackagebyanuj.blogspot.com
 */
public class MarshellingExample {

    public static void main(String[] args) {
        try {
            JAXBContext jAXBContext = JAXBContext.newInstance(Customer.class);
            Marshaller marshaller = jAXBContext.createMarshaller();

            Customer customer = new Customer();
            customer.setCustomerId("1");
            customer.setCustomerName("anuj");
            customer.setAge(25);

            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            marshaller.marshal(customer, new File("customer.xml"));
            marshaller.marshal(customer, System.out);

        } catch (JAXBException ex) {
            Logger.getLogger(MarshellingExample.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
