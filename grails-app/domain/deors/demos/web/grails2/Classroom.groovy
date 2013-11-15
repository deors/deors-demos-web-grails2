package deors.demos.web.grails2

class Classroom {

	String name
	String type
	Integer capacity
	Teacher teacher
	static hasMany = [alumni: Alumn]
	static constraints = {
		name(maxLength: 50, blank: false)
		type(inList: [
			"1st grade",
			"2nd grade",
			"3rd grade",
			"4th grade",
			"5th grade",
			"6th grade"
		])
		capacity(min: 15, max: 35)
	}

	String toString() {
		"${this.name} [${this.type}]"
	}
}
