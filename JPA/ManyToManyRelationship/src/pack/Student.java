package pack;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the students database table.
 * 
 */
@Entity
@Table(name="students")
@NamedQuery(name="Student.findAll", query="SELECT s FROM Student s")
public class Student implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int sid;

	private String studentname;

	//bi-directional many-to-many association to Cours
	@ManyToMany
	@JoinTable(
		name="std_crs"
		, joinColumns={
			@JoinColumn(name="sid")
			}
		, inverseJoinColumns={
			@JoinColumn(name="cid")
			}
		)
	private List<Cours> courses;

	public Student() {
	}

	public int getSid() {
		return this.sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getStudentname() {
		return this.studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public List<Cours> getCourses() {
		return this.courses;
	}

	public void setCourses(List<Cours> courses) {
		this.courses = courses;
	}

}