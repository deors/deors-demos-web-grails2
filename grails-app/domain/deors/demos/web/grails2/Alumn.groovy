package deors.demos.web.grails2

class Alumn {

	String name
	Date born
	String gender
	static constraints = {
		name(maxLength: 100, blank: false)
		born(nullable: false)
		gender(inList: ["Male", "Female"])
	}

	String toString() {
		"${this.name}"
	}
}
