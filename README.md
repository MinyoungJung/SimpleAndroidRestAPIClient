# Android API Client Example 

Android API Client Example Using volley.  
Simple JSON API client working with endpoint [http://landlord-reputation.herokuapp.com/reputation/api/](http://landlord-reputation.herokuapp.com/reputation/api/)

# About API
## Sample API Request
`http://landlord-reputation.herokuapp.com/reputation/api/127.0136994+37.5559542/`  
**API URL Structure** : `Endpoint URL/latitude+longitude/`

## Sample API Response
``` json
{
    "address": "서울특별시 중구 신당동 346-402",
    "latitude": "37.5559542",
    "longitude": "127.0136994",
    "description": "API 테스트 주소"
}
```

## Header Types
GET/PUT/PATHCH/DELETE(need Authentication for Non-safe Methods)

# Documentation (Korean)
For detailed documentation visit [My Blog](https://minyoungjung.github.io/%ED%8C%8C%EC%9D%B4%EC%8D%AC/django/%EC%9B%B9%EC%84%9C%EB%B9%84%EC%8A%A4/android/2017/06/27/android-rest-api-client-volley/)

## Clone project

**DO THIS (in the directory where you want the repo to live)**
```bash
git clone https://github.com/YOUR-USERNAME/SimpleAndroidRestAPIClient.git
```
(if you're unfamiliar with this process, https://help.github.com/articles/fork-a-repo)




