package com.kalixia.grapi

import spock.lang.Unroll

import static io.netty.handler.codec.http.HttpResponseStatus.OK
import static org.hamcrest.CoreMatchers.equalTo
import static spock.util.matcher.HamcrestSupport.that

class EchoResourceTest extends JaxRsResourceTest {

    @Unroll
    def "test echo of #message"() {
        expect:
        that response.status, equalTo(status)
        that response.content, equalTo(content)

        where:
        message | status
        'john'  | OK

        content = message
        url = "/echo/$message"

        response = request(url)
    }

}