package labs.lg.training;

import lglabs.mvn.wsdl.java.NumberConversion;
import lglabs.mvn.wsdl.java.NumberConversionSoapType;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URI;

public class NumberConverter {
    private static final String  ENDPOINT = "https://www.dataaccess.com/webservicesserver/NumberConversion.wso";
    private static final URI url = URI.create(ENDPOINT);
    public static void run() throws MalformedURLException {
        final NumberConversion service = new NumberConversion(url.toURL());
        NumberConversionSoapType port = service.getPort(NumberConversionSoapType.class);
        System.out.println(port.numberToDollars(BigDecimal.valueOf(15.99)));
        System.out.println(port.numberToWords(BigInteger.valueOf(34)));
    }
}
