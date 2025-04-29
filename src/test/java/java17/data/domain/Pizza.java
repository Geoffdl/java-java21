package java17.data.domain;

public class Pizza {
	private Integer id;
	private String name;
	private Integer price;

	public Pizza() {
	}

	public Pizza(Integer id, String name, Integer price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	@Override
	public String toString()
	{
		final StringBuilder sb = new StringBuilder("Pizza{");
		sb.append("id=").append(id);
		sb.append(", name='").append(name).append('\'');
		sb.append(", price=").append(price);
		sb.append('}');
		return sb.toString();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		Pizza pizza = (Pizza) o;

		return name != null ? name.equals(pizza.name) : pizza.name == null;
	}

	@Override
	public int hashCode() {
		return name != null ? name.hashCode() : 0;
	}
}