      
      
      const user = {
          age: 18,
          displayName: 'lbels',
          fullName: {
              firstName: 'Luis',
              middleName: 'Felipe',
              lastName: 'Belasco Silva'
          }
      };
      
      function getAge({age}) {
          return age;
      }
      
      function getFullName ({fullName: {firstName: first, middleName: mid, lastName: last}}) {
          return `${first} ${mid} ${last}`;
      }
      
      console.log(getAge(user))
      console.log(getFullName(user))



