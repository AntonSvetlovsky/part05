package by.epam.jonline_introduction.part05.task01.entity;

import java.util.ArrayList;
import java.util.List;

public class Directory extends File {

	private List<File> list;

	{
		list = new ArrayList<File>();
	}

	public Directory() {
	}

	public Directory(String name) {
		super(name);
	}

	public Directory(String name, List<File> list) {
		super(name);
		this.list = list;
	}

	public void addFile(File file) {
		list.add(file);
	}

	public void deleteFile(File file) {
		list.remove(file);
	}

	public List<File> getList() {
		return list;
	}

	public void setList(List<File> list) {
		this.list = list;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((list == null) ? 0 : list.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Directory other = (Directory) obj;
		if (list == null) {
			if (other.list != null) {
				return false;
			}
		} else if (!list.equals(other.list)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Directory [name=" + this.getName() + ", list=" + list + "]";
	}

}
