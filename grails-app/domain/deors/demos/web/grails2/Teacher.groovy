package deors.demos.web.grails2

class Teacher {

	String name
	Date since
	Integer salary
	static constraints = {
		name(maxLength: 100, blank: false)
		since(nullable: false)
		salary(min: 18000, max: 60000)
	}

	String toString() {
		"${this.name}"
	}
}
