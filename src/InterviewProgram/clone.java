package InterviewProgram;
 class SubjectVO {

	private String name;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name 
	 * the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	public SubjectVO(String name) {
		this.name = name;
	}
}


public class clone implements Cloneable {

	// Contained object
	private SubjectVO subj;
	private String name;

	/**
	 * @return the subj
	 */
	public SubjectVO getSubj() {
		return subj;
	}

	/**
	 * @param subj
	 * the subj to set
	 */
	public void setSubj(SubjectVO subj) {
		this.subj = subj;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 * the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	public clone(String name, String sub) {
		this.name = name;
		this.subj = new SubjectVO(sub);
	}

	public Object clone() {
		// shallow copy
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}
	
	public static void main(String[] args) {
		// Original Object
		clone stud = new clone("Johnathan", "Algebra");
		System.out.println("Original Object: " + stud.getName() + " - "
				+ stud.getSubj().getName());
		// Clone Object
		clone clonedStud = (clone) stud.clone();
		System.out.println("Cloned Object: " + clonedStud.getName() + " - "
				+ clonedStud.getSubj().getName());
		stud.setName("Daniel");
		stud.getSubj().setName("Physics1");
		//clonedStud.setName("change");
		System.out.println("Original Object after it is updated: "
				+ stud.getName() + " - " + stud.getSubj().getName());
		System.out.println("Cloned Object after updating original object: " 
						+ clonedStud.getName() + " - "
						+ clonedStud.getSubj().getName());

	}
	
}