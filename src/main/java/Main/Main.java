package Main;

import Request.Request;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

public class Main {
    static String bodyUser = "{\n" +
            "\"authData\": {\n" +
            "\"login\": \"sugarok2\",\n" +
            "\"password\": \"pswrd1\"\n" +
            "},\n" +
            "\"userData\": {\n" +
            "\"name\": \"Олежа\",\n" +
            "\"email\": \"test@test.com\",\n" +
            "\"phone\": \"+79043157002\",\n" +
            "\"birthdate\": \"1996-04-30\"\n" +
            "}\n" +
            "}";

    static String getUser = "{\n" +
            "\"id\": \"059bd12d-efaf-42f1-ab46-c8904f77ff5b\",\n" +
            "\"name\": \"Олег\",\n" +
            "\"email\": \"test@test.com\",\n" +
            "\"phone\": \"+79043157002\",\n" +
            "\"birthdate\": \"1996-04-30\",\n" +
            "\"regDate\": \"2023-11-27\"\n" +
            "}";

    public static String userID = "059bd12d-efaf-42f1-ab46-c8904f77ff5b";


    // Positive tests
    @Test
    public void createUser() {
        Request.createUser(bodyUser);
    }

    @Test
    public void getUser() {
        Request.getUser(getUser);
    }


//    @Test
//    public void createCheckBooking() {
//        String idBooking = Request.createBooking(bodyBooking).jsonPath().getString("bookingid");
//
//        Response response = BookingRequest.getBookingID(idBooking);
//        Assert.assertEquals(200,response.statusCode());
//
//        System.out.println("Создали и получили id бронирования: " + idBooking);
//    }
//
//    @Test
//    public void createUpdateCheckBooking() {
//        String token = BookingRequest.createToken(bodyAuth).jsonPath().getString("token");
//        System.out.println("Получили токен: " + token);
//
//        String idBooking = BookingRequest.createBooking(bodyBooking).jsonPath().getString("bookingid");
//        System.out.println("Создали бронирование с id: " + idBooking);
//
//        BookingRequest.updateBooking(bodyUpdate, checkoutDate, idBooking, token);
//        Response response = BookingRequest.getBookingID(idBooking);
//        Assert.assertEquals(200,response.statusCode());
//        System.out.println("Обновили дату бронирования: " + checkoutDate + ". id бронирования: " + idBooking);
//    }
//
//    @Test
//    public void createDeleteCheckBooking() {
//        String token = BookingRequest.createToken(bodyAuth).jsonPath().getString("token");
//        System.out.println("Получили токен: " + token);
//
//        String idBooking = BookingRequest.createBooking(bodyBooking).jsonPath().getString("bookingid");
//        System.out.println("Создали бронирование с id: " + idBooking);
//
//        BookingRequest.deleteBooking(bodyAuth, idBooking, token);
//
//        Response response = BookingRequest.getBookingID(idBooking);
//        Assert.assertEquals(404,response.statusCode());
//        System.out.println("Удалили бронирование с id: " + idBooking);
//    }
//    //Negative tests
//
////    @Test
////    public void negativeGetToken() {
////        String token = BookingRequest.createToken(bodyAuth).jsonPath().getString("token");
////        Response response = BookingRequest.getToken(bodyAuth);
////        Assert.assertEquals(400, response.statusCode());
////    }
//
//    @Test
//    public void negativeCreateBooking() {
//        String idBooking = BookingRequest.createBooking(wrongBodyBooking).jsonPath().getString("bookingid");
//
//        Response response = BookingRequest.getBookingID(idBooking);
//        Assert.assertEquals(500,response.statusCode());
//
//        System.out.println("Создали и получили id бронирования: " + idBooking);
//    }
}




