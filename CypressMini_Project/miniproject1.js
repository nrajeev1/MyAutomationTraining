describe('My Suite', function () {
    it('Hompage', function () {
       cy.visit('https://pega-86-demo.iqzsystems.io/prweb/app/default/b0aUC_g2NnC90uEC3dhEbKXJdQTMkXeP*/!STANDARD')        //Launching url,username and password
       cy.get('#txtUserID').type('tcapron')
       cy.get('#txtPassword').type('rules@123')
       cy.get('#sub').click()
    })
    it('Dashboard page', function () {
        // Click Plus icon and Individual lead button
        cy.get('body > div:nth-child(7) > aside:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > ul:nth-child(1) > li:nth-child(1) > a:nth-child(1) > span:nth-child(1) > span:nth-child(1)').click()
        cy.get('li:nth-child(7)').click()
       //Entering details in Individual lead button
       cy.get('#546ad300').type('FirstNametest')
       cy.get('#6e54da89').type('Lastnametest')
       //Clicking Submit button
       cy.get('#RULE_KEY > div > div.content-item.content-layout.item-2.remove-top-spacing.remove-bottom-spacing.remove-right-spacing.align-end.flex.flex-row > div > div > span > button').click()
    })
})