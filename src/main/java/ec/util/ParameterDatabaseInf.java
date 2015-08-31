package ec.util;

public interface ParameterDatabaseInf {

	boolean exists(Parameter base, Parameter def);
	
	int getInt(Parameter base, Parameter def, int min);
	
	int getIntWithDefault(Parameter base, Parameter def, int defaultInt);
	
	boolean getBoolean(Parameter base, Parameter def, boolean defaultBool);
	
	String getString(Parameter base, Parameter def);
	
	String getStringWithDefault(Parameter base, Parameter def, String defaultString);
}
