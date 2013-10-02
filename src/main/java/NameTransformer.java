import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractTransformer;


public class NameTransformer extends AbstractTransformer {

	@Override
	protected Object doTransform(Object src, String enc)
			throws TransformerException {
		if (src instanceof String){
	        String name = (String)src;
	        if (name.charAt(0) == '/'){
	        return name.substring(1);
	    }
	     }
	         
	     return src;
	//- See more at: http://www.mulesoft.org/documentation/display/current/Transforming+Data+in+a+Flow#sthash.BMF19Xc8.dpuf
	}

}
