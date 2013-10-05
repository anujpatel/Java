package com.anuj.xml;

import com.anuj.entity.Customer;
import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
 * Convert XML to Object
 * @author Anuj
 * www.goldenpackagebyanuj.blogspot.com
 */
public class UnMarshallingExample {

    /**
     * @param args
     */
    public static void main(String[] args) {

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);
            File file = new File("customer.xml");

            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            Customer customer = (Customer) unmarshaller.unmarshal(file);

            System.out.println("Customer Id : " + customer.getCustomerId());
            System.out.println("Customer Name : " + customer.getCustomerName());
            System.out.println("Customer age : " + customer.getAge());


        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }
}
