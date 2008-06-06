package com.legstar.codegen.models;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import com.legstar.codegen.CodeGenHelper;
import com.legstar.codegen.CodeGenMakeException;
import com.legstar.codegen.CodeGenUtil;
import com.legstar.codegen.CodeGenVelocityException;

/**
 * A model usable for ant script generation. Meant to be used by
 * specialized generators which first create and ant script which
 * in turn creates the various artifacts.
 *
 */
public abstract class AbstractAntBuildModel implements IAntBuildModel {
	
	/** Where the base LegStar product is installed. */
	private String mProductLocation;
	
	/** This temporary file can be used by caller to check whether the ant
	 * script succeeded. */
	private File mProbeFile;
	
	/**  Suffix of generated ANT script file. */
	public static final String ANT_FILE_SUFFIX = "xml";

	/** Prefix of generated ANT script file. */
	public static final String ANT_FILE_PREFIX = "build-";

	/**
	 * Creates an ant build script file ready for launching.
	 * @param generatorName the name of the actual generator
	 * @param targetFile the script file that must be created
	 * @param velocityMacro the template to apply
	 * @throws CodeGenMakeException if generation fails
	 */
	public void generateBuild(
			final String generatorName,
			final String velocityMacro,
			final File targetFile) throws CodeGenMakeException {
		try {
			CodeGenUtil.initVelocity();
			CodeGenHelper helper = new CodeGenHelper();
			Map < String, Object > parameters =
				new HashMap < String, Object >();
			parameters.put("helper", helper);

			CodeGenUtil.processTemplate(
					generatorName,
					velocityMacro,
					"model", this,
					parameters,
					targetFile);
			
		} catch (CodeGenVelocityException e) {
			throw new CodeGenMakeException(e);
		}
	}

	/**
	 * @return the Where the base LegStar product is installed. This is used
	 * as the basedir for the generated ant script.
	 */
	public final String getProductLocation() {
		return mProductLocation;
	}

	/**
	 * @param productLocation the Where the base LegStar product is installed to
	 *  set
	 */
	public final void setProductLocation(final String productLocation) {
		mProductLocation = productLocation;
	}

	/**
	 * @return the temporary file used to check whether the ant script succeeded
	 */
	public final File getProbeFile() {
		return mProbeFile;
	}

	/**
	 * @param probeFile the temporary file used to check whether the ant
	 *  script succeeded to set
	 */
	public final void setProbeFile(final File probeFile) {
		mProbeFile = probeFile;
	}
}
