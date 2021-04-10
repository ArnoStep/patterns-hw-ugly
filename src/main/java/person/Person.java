package person;

import person.appearance.Appearance;

public class Person {

    private String id;
    private String name;
    private Physical phys;
    private Appearance appearance;
    private Phone phone;

    public static class Builder {
        private String id;
        private String name;
        private Physical phys;
        private Appearance appearance;
        private Phone phone;

        public Builder(final String id) {
            this.id = id;
        }

        public final Builder withName(final String name) {
            this.name = name;
            return this;
        }

        public final Builder withPhys(final Physical phys) {
            this.phys = phys;
            return this;
        }

        public final Builder withAppearance(final Appearance appearance) {
            this.appearance = appearance;
            return this;
        }

        public final Builder withPhone(final Phone phone) {
            this.phone = phone;
            return this;
        }

        public final Person build() {
            final Person account = new Person();
            account.id = this.id;
            account.name = this.name;
            account.phys = this.phys;
            account.appearance = this.appearance;
            account.phone = this.phone;
            return account;
        }

    }

    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder()
                .append(id).append("\n");
        if (name != null) {
            sb.append(String.format("%1$s", name)).append("\n");
        } else {
            sb.append("Информации о ФИО нет").append("\n");
        }
        if (phys != null) {
            sb.append(phys).append("\n");
        } else {
            sb.append("Информации о весе и росте нет").append("\n");
        }
        if (appearance != null) {
            sb.append(appearance).append("\n");
        } else {
            sb.append("Информации о глазах и волосах нет").append("\n");
        }
        if (phone != null) {
            sb.append(phone);
        } else {
            sb.append("Телефона нет");
        }
        return sb.toString();
    }
}