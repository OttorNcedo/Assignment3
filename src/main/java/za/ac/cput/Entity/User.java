/**
 * Mziyanda Mwanda
 * 215133765
 * Assignment 3
 * 11 June 2021
 * */
package za.ac.cput.Entity;

public class User {
    private String userId, firstName, lastName;

    private User(Builder builder){
        this.userId = builder.userId;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public static class Builder{
        private String userId, firstName, lastName;

        public Builder setUserId(String userId){
            this.userId = userId;

            return this;
        }

        public Builder setFirstName(String firstName){
            this.firstName = firstName;

            return this;
        }

        public Builder setLastName(String lastName){
            this.lastName = lastName;

            return this;
        }

        public User build(){

            return new User(this);
        }

        public Builder copy(User user){
            this.userId = user.userId;
            this.firstName = user.firstName;
            this.lastName = user.lastName;

            return this;
        }



    }
}
